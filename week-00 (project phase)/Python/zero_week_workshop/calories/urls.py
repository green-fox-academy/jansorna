from django.urls import path, include

from . import views
from rest_framework import routers

router = routers.DefaultRouter()
router.register('meals', views.MealView)
router.register('calories', views.CaloriesPerDayView)

urlpatterns = [
    path('', include(router.urls)),
]