![banner]

[ This is in very early stages of development ]

## Dependencies

 * [BouncyCastle](http://www.bouncycastle.org/)
 * [Gson](https://github.com/google/gson) v2.6.2+

### Download Dependencies

```
mkdir lib
wget https://raw.githubusercontent.com/muflihun/muflihun.github.io/master/downloads/bcprov-jdk15on-156.jar -O lib/bcprov-jdk15on-156.jar ## BouncyCastle
wget https://raw.githubusercontent.com/muflihun/muflihun.github.io/master/downloads/gson-2.6.2.jar -O lib/gson-2.6.2.jar ## GSON
```

### Higher security

You may be interested in Unlimited Strength Jurisdiction Policy Files for higher security and ability to use AES-256 cryptography. Please make sure you read the policy statement.

You can [download it from here](https://raw.githubusercontent.com/muflihun/muflihun.github.io/master/downloads/UnlimitedJCEPolicyJDK7.zip) and make sure you unzip these files to `<java-home>/jre/lib/security` (please make backups as required).

#### Official Links

* BouncyCastle: https://www.bouncycastle.org/download/bcprov-jdk15on-156.jar
* GSON: https://repo1.maven.org/maven2/com/google/code/gson/gson/2.6.2/gson-2.6.2.jar
* JCE Policy Files 6: http://www.oracle.com/technetwork/java/javase/downloads/jce-6-download-429243.html
* JCE Policy Files 7: http://www.oracle.com/technetwork/java/javase/downloads/jce-7-download-432124.html
* JCE Policy Files 8: http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html

## Compiling

All the following commands should be run from the root directory.

### Compile Library

```
mkdir bin
sh compile-lib.sh
```

### Compile & Running The Sample Application

```
sh compile-and-run-sample.sh
```

  [banner]: https://raw.githubusercontent.com/muflihun/residue-java/master/tools/ResidueJ.png