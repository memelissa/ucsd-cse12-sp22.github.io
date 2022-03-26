---
layout: with-sidebar
index: 2
name: Classes and Fields
released-on: "2022-03-31"
videos:
  - title: Review, (Array) Lists
    url: https://drive.google.com/file/d/1ouaycQpAGEqNo-I-BAeTQwWvFaBnU-6k
worksheets:

---

## Problem Session 2 – Classes and Fields

_{{ page.released-on }}_

Session plan:
- 2-3 min: Welcome, logistics questions
- 20 min: First page of handout + discussion + demo
- 25 min: Second page of handout + discussion + demo

Readings (to be completed by 9am on March 30, **before** problem session). You will
need to make an account on Stepik to have your work saved.
- [Stepik 1.1-1.3](https://stepik.org/lesson/559661/step/1?unit=553721){:target="_blank"}
- [Stepik 2.1-2.3](https://stepik.org/lesson/571216/step/1?unit=565754){:target="_blank"}

To ensure you get credit for the Stepik exercises, you must fill out this [form](https://forms.gle/oupi3xifMT6zxTKE6)
by Friday of Week 2. Starting in Week 3, we will strive to post Stepik grades to Canvas every week.

Videos (to watch **before** your problem session on March 31):

{% for video in page.videos %}
[{{ video.title }}]({{ video.url }}){:target="_blank"}

<iframe src="{{ video.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
{% endfor %}

Handout (used during the session), [direct link](https://drive.google.com/file/d/1c24cFNcp6_uGf5bbRRSPkaY_DKmEs6zh/preview){:target="_blank"}

<iframe src="https://drive.google.com/file/d/1c24cFNcp6_uGf5bbRRSPkaY_DKmEs6zh/preview" width="640" height="480" allow="autoplay"></iframe>

## Notes & Files from Pre-Lecture

[Pre-Lecture 3](https://github.com/ucsd-cse12-sp22/ucsd-cse12-sp22.github.io/tree/main/_pre-lectures/lecture-03){:target="_blank"}

## Completed Worksheets from Lecture

{% for worksheet in page.worksheets %}
<div class="worksheetBox">
{{ worksheet.title }}
<br>
<iframe src="{{ worksheet.url }}/preview" width="640" height="480" allow="autoplay"></iframe>
</div>
{% endfor %}
