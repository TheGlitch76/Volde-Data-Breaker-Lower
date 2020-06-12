# DataBreaker

this is a very cused mod  
it makes mc load way faster (on server and client) by removing DataFixerUpper  
i'm not responsible if you completely screw up your world  
thanks, have a great day  

## How to add this mod to your dev env
If you have the inclination to add DataBreaker to your dev env, follow these 3 easy steps:  
1. Add this to your build script before `dependencies`
```
repositories {
	maven { url = "https://jitpack.io" }
}
```
2. Add this to your build script in `dependencies`:
```
modRuntime ("com.github.TheGlitch76:Volde-Data-Breaker-Lower:<whatever the latest commit hash is>")
```
3. cry
