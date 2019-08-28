# Gematria

Calculate gematria value of Hebrew letters/words.
Convert a number to its representation by Hebrew letters.

## Installation
[![](https://jitpack.io/v/aitorvs/auto-parcel.svg)](https://jitpack.io/#aitorvs/auto-parcel)

### Repository

Add the following repo to your `app/build.gradle`

```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```

### Dependencies

Add the following to build.gradle:
```gradle
dependencies {
    
    //... other dependencies here
    implementation 'com.github.elfifo4:gematria:1.0.2'
    
}
```

## Usage
```java
System.out.println(Gematria.getOtiot(123)); // -> קכג
System.out.println(Gematria.gematriaWord("תשעט")); // -> 779
```
