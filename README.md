# DataBreaker
## Information
###### A corner cut is a corner saved.
Databreaker is a mod that makes your car faster by removing the airbags. It reduces startup time (to main menu) and heap usage by 40%, and improves FPS on memory-bound environments by reducing GC pressure. It accomplishes this by removing DataFixerUpper, which is Mojang's tools to make sure your worlds don't corrupt whenever it is updated.
### Why this is awful
DFU only runs on loaded chunks, so adding Databreaker to a world that was created before the current version and has not had "Optimize World" run will corrupt. Additionally, there are *no safety nets*. If you accidentally do this, Minecraft will happily try to load the broken data.
## How to add this mod to your dev env
If you have the inclination to add DataBreaker to your dev env, follow these ~~3~~ 5 easy steps:
1. Merge this with your `buildscript` block:
```
buildscript {
	repositories {
		maven { url='https://dist.creeper.host/Sponge/maven' }
	}
	dependencies {
		[...]
        	classpath 'org.spongepowered:mixingradle:0.7-SNAPSHOT'
    	}
}
```
2. Add this at the bottom of your `apply plugin:` group:
```
apply plugin: 'org.spongepowered.mixin'
```
3. Add this to your build script before `dependencies`
```
repositories {
	maven { url = "https://jitpack.io" }
}
```
4. Add this to your build script in `dependencies`:
```
implementation fg.deobf('com.github.TheGlitch76:Volde-Data-Breaker-Lower:347c0d6c73')
```
5. cry
## Original description
this is a very cused mod

it makes mc load way faster (on server and client) by removing DataFixerUpper

i'm not responsible if you completely screw up your world

thanks, have a great day
