package ru.top.project.dao.impl;

import org.springframework.stereotype.Repository;
import ru.top.project.dao.TagDao;
import ru.top.project.model.Tag;
@Repository
public class TagDaoImpl implements TagDao {
    @Override
    public Tag addTag(Tag tag){
        return tag;
    }

    @Override
    public Tag getAllTag() {
        return null;
    }

    @Override
    public Tag deleteTag() {
        return null;
    }

    public Tag deleteTag(Tag tag){
        return null;
    }


}
