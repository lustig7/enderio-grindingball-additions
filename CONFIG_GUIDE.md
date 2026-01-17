# Grinding Ball Additions - Configuration Guide

## Overview
All grinding ball values can now be modified through the Minecraft configuration system. The config file is automatically generated when you first run the game with this mod installed.

## Config File Location
After running the game, you'll find the configuration file at:
```
<minecraft_directory>/config/grindingballadditions-common.toml
```

On different operating systems:
- **Windows**: `%APPDATA%/.minecraft/config/grindingballadditions-common.toml`
- **Linux**: `~/.minecraft/config/grindingballadditions-common.toml`
- **macOS**: `~/Library/Application Support/minecraft/config/grindingballadditions-common.toml`

## Configuration Options

### Allthemodium Grinding Ball
```toml
[allthemodium_grinding_ball]
    # Speed multiplier for Allthemodium Grinding Ball (0.1 - 10.0, default: 1.8)
    speed = 1.8
    
    # Efficiency multiplier for Allthemodium Grinding Ball (0.1 - 10.0, default: 2.0)
    efficiency = 2.0
    
    # Unbreaking level multiplier for Allthemodium Grinding Ball (0.1 - 10.0, default: 1.4)
    unbreaking = 1.4
    
    # Durability (in uses) for Allthemodium Grinding Ball (1 - 2147483647, default: 360000)
    durability = 360000
```

### Vibranium Grinding Ball
```toml
[vibranium_grinding_ball]
    # Speed multiplier for Vibranium Grinding Ball (0.1 - 10.0, default: 2.0)
    speed = 2.0
    
    # Efficiency multiplier for Vibranium Grinding Ball (0.1 - 10.0, default: 4.0)
    efficiency = 4.0
    
    # Unbreaking level multiplier for Vibranium Grinding Ball (0.1 - 10.0, default: 2.0)
    unbreaking = 2.0
    
    # Durability (in uses) for Vibranium Grinding Ball (1 - 2147483647, default: 1060000)
    durability = 1060000
```

### Unobtainium Grinding Ball
```toml
[unobtainium_grinding_ball]
    # Speed multiplier for Unobtainium Grinding Ball (0.1 - 10.0, default: 3.0)
    speed = 3.0
    
    # Efficiency multiplier for Unobtainium Grinding Ball (0.1 - 10.0, default: 2.0)
    efficiency = 2.0
    
    # Unbreaking level multiplier for Unobtainium Grinding Ball (0.1 - 10.0, default: 1.0)
    unbreaking = 1.0
    
    # Durability (in uses) for Unobtainium Grinding Ball (1 - 2147483647, default: 1600000)
    durability = 1600000
```

### Infinite Grinding Ball
```toml
[infinite_grinding_ball]
    # Speed multiplier for Infinite Grinding Ball (0.1 - 10.0, default: 3.0)
    speed = 3.0
    
    # Efficiency multiplier for Infinite Grinding Ball (0.1 - 10.0, default: 3.0)
    efficiency = 3.0
    
    # Unbreaking level multiplier for Infinite Grinding Ball (0.1 - 10.0, default: 3.0)
    unbreaking = 3.0
    
    # Durability (in uses) for Infinite Grinding Ball (1 - 2147483647, default: 2147483647)
    # Note: Use 2147483647 (Integer.MAX_VALUE) for infinite durability
    durability = 2147483647
```

## How to Modify Values

1. **Stop the game** (if it's running)
2. **Locate the config file** (see location above)
3. **Open the file** with a text editor (Notepad, VS Code, etc.)
4. **Modify the values** you want to change
5. **Save the file**
6. **Start the game** - the changes will be applied

### Example: Making Allthemodium Balls Faster
Change this:
```toml
speed = 1.8
```

To this:
```toml
speed = 3.5
```

## Valid Value Ranges

- **Speed, Efficiency, Unbreaking**: 0.1 to 10.0 (decimal values allowed)
- **Durability**: 1 to 2,147,483,647 (integer values only)

## Notes

- All changes take effect after restarting the game
- The config values override the default hardcoded values
- Setting durability to `2147483647` (Integer.MAX_VALUE) makes the grinding ball effectively infinite
- You can safely delete the config file and it will be regenerated with default values on next game start
