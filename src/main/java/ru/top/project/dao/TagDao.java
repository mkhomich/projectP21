package ru.top.project.dao;

import ru.top.project.model.Tag;
public interface TagDao {
    Tag addTag(Tag tag);
    Tag getAllTag();
    Tag deleteTag();
}
