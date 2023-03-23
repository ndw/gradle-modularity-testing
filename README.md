# Modularity test

This little test repository exists to help explain my Gradle
[forum message](https://discuss.gradle.org/t/access-a-custom-task-type-from-a-plugin/45222).

Basically, I have a complicated build script. I’d like to modularize it.

When I search the web for explanations about how to modularize build
scripts, the most common answer is plugins or extensions.

I can see how that might work. So I setup one up.

In `build.gradle`, you’ll find a short attempt to explain my
motivation and an attempt to test the extension.

The `toyNumberedFrom` method on the extension can create serveral
tasks and I can use them from my build script. Good.

But I want `realNumberedFrom` to create tasks of type `SaxonXsltTask`
and I can’t for the life of me work out how I’m supposed to get that
into the extension. Importing it didn’t work. Adding `SaxonXsltTask` to
the `buildSrc/build.gradle` didn’t work.

It’s possible that

1. This is completely the wrong way to go about this. Fine. What’s the right way? Or,
2. I’m overlooking something completely obvious. Also fine. What?
3. Something else.

My money is on 2 then 1. But I’ve been wrong about Gradle before. More
than once.
