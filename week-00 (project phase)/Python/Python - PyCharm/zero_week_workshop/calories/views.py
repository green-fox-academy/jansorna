from rest_framework import viewsets

from .serializers import *

class MealView(viewsets.ModelViewSet):
    queryset = Meal.objects.all()
    serializer_class = MealSerializer

class CaloriesPerDayView(viewsets.ModelViewSet):
    queryset = CaloriesPerDay.objects.all()
    serializer_class = CaloriesPerDaySerializer