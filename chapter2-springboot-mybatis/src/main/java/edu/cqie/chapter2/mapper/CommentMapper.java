package edu.cqie.chapter2.mapper;

import edu.cqie.chapter2.entity.Comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {
    @Select("select * from t_comment where id=#{id}")
    Comment slectCommentById(int id);

    @Delete("delete * from t_comment where id=#{id}")
    int delet(int id);

//    @Insert("insert into t_comment(id,content,author,a_id) values (#{content},#{author},#{aId})")
    int insertComment(Comment comment);

//    @Update("update t_comment set content=#{content},author=#{author},a_id=#{aId} where id = #{id}")
    int updateComment(Comment comment);
}
