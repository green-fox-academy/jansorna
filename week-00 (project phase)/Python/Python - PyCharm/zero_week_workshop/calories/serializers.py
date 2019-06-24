from rest_framework import serializers
from .models import *

class MealSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = Meal
        fields = ('id', 'url', 'name', 'calories', 'date')

class CaloriesPerDaySerializer(serializers.ModelSerializer):
    class Meta:
        model = CaloriesPerDay
        fields = ('id', 'sum')