from rest_framework import serializers
from rest_framework.serializers import SerializerMethodField
from .models import *


class MovieSerializer(serializers.HyperlinkedModelSerializer):
    imdb_rating = SerializerMethodField()

    class Meta:
        model = Movie
        fields = ('id', 'url', 'name', 'imdb_rating')

    def get_imdb_rating(self, name):
        return Movie.get_rating(name)
