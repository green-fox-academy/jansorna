from django import forms

class CommentForm(forms.Form):
    name = forms.CharField(max_length=20)
    comment = forms.CharField(widget=forms.Textarea())