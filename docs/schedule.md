---
layout: default
title: Расписание
nav_order: 2
description: "Информационный сайт 11-А класса."
has_toc: false
---

## 11-A, на Этой Неделе:

**Четверг:** 
{: .text-blue-100 }
<div id="Thu">ERROR: COULD NOT LOAD THE VALUE; REPORT TO MICHAEL.</div>
{: .text-yellow-300 }

<!-- Паша, что ты тут забыл? -->
<script>
	function getMonday(d) {
		var diff = d.getDate() - d.getDay() + (d.getDay() === 0 ? -6 : 1);
		return new Date(d.setDate(diff)).getDate();
	}
	var mon = getMonday(new Date());
	var thu = mon % 2 == 0? "Всесвітня Історія" : "Захист";
	document.getElementById("Thu").innerHTML = thu;
</script>

