---
layout: with-sidebar
index: 2
name: Testing/Review
released-on: "2022-03-31"
videos:
  - title: Review, (Array) Lists
    url: https://drive.google.com/file/d/1ouaycQpAGEqNo-I-BAeTQwWvFaBnU-6k
---

## Problem Session 2 – Testing/Review

_{{ page.released-on }}_

Videos (to watch **before** your problem session on March 31):

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Notes & Files from Pre-Lecture

[Pre-Lecture 3](https://github.com/ucsd-cse12-sp22/ucsd-cse12-sp22.github.io/tree/main/_pre-lectures/lecture-03){:target="_blank"}

## Notes & Files from Live-Lecture

[Notes](https://github.com/ucsd-cse12-sp22/ucsd-cse12-sp22.github.io/tree/main/_lectures/lecture-02){:target="_blank"}

