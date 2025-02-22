package in.techcamp.firstapp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

iport java.util.List;

@Mapper
public interface PostRepository {
    @Select("select * form posts")
    List<PostEntity> findAll();
}
