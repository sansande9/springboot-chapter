package edu.cqie.springthymeleaf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cqie.springthymeleaf.entity.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
    @Select("select * from t_comment where id=#{id}")
    Comment slectCommentById(int id);

    @Delete("delete * from t_comment where id=#{id}")
    int delet(int id);
    @Select("select * from t_comment where id=#{id}")
    List<Comment> list();
    //    @Insert("insert into t_comment(id,content,author,a_id) values (#{content},#{author},#{aId})")
    int insertComment(Comment comment);

    //    @Update("update t_comment set content=#{content},author=#{author},a_id=#{aId} where id = #{id}")
    int updateComment(Comment comment);
}
