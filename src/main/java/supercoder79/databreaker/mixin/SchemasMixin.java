/*
 * Copyright 2020 Chocohead
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package supercoder79.databreaker.mixin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

import net.minecraft.datafixer.Schemas;

import supercoder79.databreaker.NoopSchema;

@Mixin(Schemas.class)
class SchemasMixin {
	/**
	 * @author Chocohead
	 * @reason DFU is huge and slow, so if it isn't needed we save a lot
	 */
	@Overwrite
	private static DataFixer create() {
		return new DataFixer() {
			private final Logger logger = LogManager.getLogger("DataBreakerLower");
			private final Schema noopSchema = new NoopSchema();

			@Override
			public <T> Dynamic<T> update(TypeReference type, Dynamic<T> input, int version, int newVersion) {
				if (version < newVersion) {
					//This is probably not good for the thing which needs to be updated
					logger.warn("Skipping updating a " + type + " (" + input + ") from " + version);
				}

				return input;
			}

			@Override
			public Schema getSchema(int key) {
				return noopSchema;
			}
		};
	}
}