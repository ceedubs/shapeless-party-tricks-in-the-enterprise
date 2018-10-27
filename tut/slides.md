<!DOCTYPE html>
<html>
  <head>
    <title>Shapeless party tricks in the enterprise</title>
    <meta charset="utf-8">
    <style>
      @import url(https://fonts.googleapis.com/css?family=Yanone+Kaffeesatz);
      @import url(https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic);
      @import url(https://fonts.googleapis.com/css?family=Ubuntu+Mono:400,700,400italic);

      body {
        font-family: 'Droid Serif', 'Helvetica';
      }
      h1, h2, h3 {
        font-family: 'Yanone Kaffeesatz', 'Gill Sans';
        font-weight: normal;
      }
      .grouping { background-color: beige }
      .remark-slide-content {
        font-size: 20px;
      }
      .remark-code, .remark-inline-code {
        font-family: 'Ubuntu Mono', 'Consolas', 'Courier New';
        font-size: 20px;
      }
    </style>
  </head>
  <body>
    <textarea id="source">

class: center, middle

# Shapeless party tricks in the enterprise
Cody Allen

---

# Shapeless

From the README:

> shapeless is a type class and dependent type based generic programming library for Scala.

???

Kind of vague? That's okay we'll learn by example.

---

# who is this guy?

- scala developer ~6 years
- OSS contributor (mostly Cats)
- [typelevel](http://typelevel.org/) member
- machine learning and NLP at Salesforce

---

name: agenda

# the agenda

1. TODO ceedubs
2. TODO ceedubs

???

Poll the audience on whether they are familiar with Shapeless.

---

# shapeless

---

#  imports

These imports are assumed throughout the presentation.

```tut:silent
val s: String = "TODO ceedubs"
```

---

# HList

the type safety of tuples with the composability of lists.

```tut:silent
import shapeless._
```

```tut:book
val h = 3 :: true :: "foo" :: HNil

h.reverse

h(2)
```

```tut:book:fail
h(3)
```

---

# Nat

type-level natural numbers

```tut:book
val s = "TODO"
```

---

class: center, middle

# Thanks!

Special thanks to:

Miles Sabin (@milessabin) for creating Shapeless.

Travis Brown (@travisbrown) for giving great answers to lots of Shapeless questions on Stack Overflow.

Rob Norris (@tpolecat) for creating [tut](https://github.com/tpolecat/tut) and giving me permission to copy/paste his slide setup from [Fun and Games with Fix, Cofree, and Doobie](https://github.com/tpolecat/cofree).

---

# resources

- [this presentation](https://github.com/ceedubs/shapeless-party-tricks-in-the-enterprise)
- [shapeless](https://github.com/milessabin/shapeless)
- [kittens](https://github.com/typelevel/kittens)
- [typelevel](http://typelevel.org/)
- [tut](https://github.com/tpolecat/tut)

---

# Questions?

 </textarea>
    <script src="https://remarkjs.com/downloads/remark-0.14.0.min.js">
    </script>
    <script>
      var slideshow = remark.create();
    </script>
  </body>
</html>
