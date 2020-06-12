/*
 * Copyright 2020 Chocohead
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package supercoder79.databreaker;

import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;

import net.minecraft.SharedConstants;

public class NoopSchema extends Schema {
	public NoopSchema() {
		super(SharedConstants.getGameVersion().getWorldVersion(), null);
	}

	@Override
	public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
		return Collections.emptyMap();
	}

	@Override
	public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
		return Collections.emptyMap();
	}

	@Override
	public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> entityTypes, Map<String, Supplier<TypeTemplate>> blockEntityTypes) {
	}
	
	@Override
	protected Map<String, Type<?>> buildTypes() {
		return Collections.emptyMap();
	}

	@Override
	public Type<?> getTypeRaw(TypeReference type) {
		throw new UnsupportedOperationException("Tried to get raw type of " + type);
	}

	@Override
	public Type<?> getType(TypeReference type) {
		throw new UnsupportedOperationException("Tried to get type of " + type);
	}

	@Override
	public TypeTemplate resolveTemplate(String name) {
		throw new UnsupportedOperationException("Tried to resolve template of " + name);
	}

	@Override
	public TaggedChoiceType<?> findChoiceType(TypeReference type) {
		return null;
	}

	@Override
	public Type<?> getChoiceType(TypeReference type, String choiceName) {
		return null;
	}
}