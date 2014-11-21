CDYNE
=====

Library containing auto-generated Axis2 SOAP client for Java 1.5+

To use this library in another Maven Project:
---------------------------------------------

Add the following to the pom.xml:

```<repositories>
    <repository>
        <id>maven.leadoperations.co-release</id>
        <name>AWS S3 Release Repository</name>
        <url>http://maven.leadoperations.co/release</url>
    </repository>
    <repository>
        <id>maven.leadoperations.co-snapshot</id>
        <name>AWS S3 Snapshot Repository</name>
        <url>http://maven.leadoperations.co/snapshot</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>```

Then add the dependency:

```<dependency>
    <groupId>com.cleanenergyexperts</groupId>
    <artifactId>cdyne</artifactId>
    <version>1.0.0.RELEASE</version>
</dependency>```