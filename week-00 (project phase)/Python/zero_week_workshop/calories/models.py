from django.db import models
from django.db.models import Sum


class Meal(models.Model):
    name = models.CharField(max_length=40)
    calories = models.IntegerField()
    date = models.DateField()

    def __str__(self):
        return self.name


class CaloriesPerDay(models.Model):
    sum = Meal.objects.all().values('date').annotate(sum=Sum('calories')).order_by()
