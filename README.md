# DataBreaker

this is a very cursed mod
it makes mc load way faster (on server and client) by removing DataFixerUpper
i'm not responsible if you completely screw up your world
thanks, have a great day

## How to add this mod to your dev env
If you have the inclination to add DataBreaker to your dev env, follow these ~~3~~ 5 easy steps:
1. Merge this with your `buildscript` block:
```
	buildscript {
		repositories {
			maven { url='https://dist.creeper.host/Sponge/maven' }
		}
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
modRuntime ("com.github.TheGlitch76:Volde-Data-Breaker-Lower:347c0d6c73")
```
5. cry
