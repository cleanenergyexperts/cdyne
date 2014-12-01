CDYNE
=====

Library containing auto-generated Axis2 SOAP client for Java 1.5+

To use this library in another Maven Project:
---------------------------------------------

Add the following to the pom.xml for releases:

```
<repositories>
    <repository>
        <id>maven.leadoperations.co-release</id>
        <name>AWS S3 Release Repository</name>
        <url>http://maven.leadoperations.co/release</url>
    </repository>
</repositories>
```

or for snapshots:
```
<repositories>
    <repository>
        <id>maven.leadoperations.co-snapshot</id>
        <name>AWS S3 Snapshot Repository</name>
        <url>http://maven.leadoperations.co/snapshot</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

Then add the dependency:

```
<dependency>
    <groupId>com.cleanenergyexperts</groupId>
    <artifactId>cdyne</artifactId>
    <version>0.1.0</version>
</dependency>
```

Releasing a new version:
------------------------
`mvn release:prepare`
`mvn release:perform`