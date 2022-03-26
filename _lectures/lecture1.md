---
layout: with-sidebar
index: 1
name: Introduction
released-on: "2022-03-29"
videos:
    - title: "Welcome"
      url: https://drive.google.com/file/d/1OQW-Gji89qB8WPkicO2kgzQBzyUauC7F
    - title: "Testing/Review"
      url: https://drive.google.com/file/d/1ilj1cWlGSgQchzY0tAHP2kNp9AjSx_wR
worksheets:

---
## Problem Session 1 – Introduction/Testing

_{{ page.released-on }}_

Welcome to the page for the first problem session! Each problem session will
come with a page like this that summarizes the videos you should watch and
readings you should complete **beforehand**, along with any handouts for the day
and code examples, notes, and recordings from the problem solving session.

Session plan:
- 2-3 min: Introduce instructors/staff
- 2-3 min: Say hi to the people around you
- 20 min: syllabus
    - Problem Solving Sessions, videos
    - zyBooks
    - Programming
    - Exams
    - Getting Help
    - Schedule
    - Lecture 1 and 2 pages
- 5 min: q/a
- 15 min: Handout + discussion

Before the first lecture, there are two videos to watch. You should also familiarize
yourself with the [syllabus](../syllabus.html).

Videos (to watch **before** your problem session on March 31):

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

## Notes & Files from Pre-Lecture

[Pre-Lecture 1](../_pre-lectures/lecture-01){:target="_blank"}

[Pre-Lecture 2](../_pre-lectures/lecture-02){:target="_blank"}

## Notes & Files from Live-Lecture

[Notes](../_lectures/lecture-01){:target="_blank"}
