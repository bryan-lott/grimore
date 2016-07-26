# gm-familiar
A note taking application designed to take advantage of in-message tagging, searching, etc.

A [re-frame](https://github.com/Day8/re-frame) application.

## Development Mode

### Run application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

## Production Build

```
lein clean
lein cljsbuild once min
```
