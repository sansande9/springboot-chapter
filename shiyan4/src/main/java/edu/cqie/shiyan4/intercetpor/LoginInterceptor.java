//package edu.cqie.shiyan4.intercetpor;
//
//
//import edu.cqie.shiyan4.entity.User;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//public class LoginInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Object user = request.getSession().getAttribute("loginUser");
//        if (user == null) {   //未登陆，返回登陆页面
//            request.setAttribute("msg", "没有权限请先登陆");
//            request.getRequestDispatcher("/user/login").forward(request, response);
//            return false;
//        } else {  //已登陆，放行请求
//            String URI=request.getRequestURI();
//            User loginUser=(User)user;
//            String role=loginUser.getRole();
//            if(URI.startsWith("/user/common")&&!role.equals("common")){
//                request.getRequestDispatcher("/user/noauth").forward(request, response);
//                return false;
//            }else if(URI.startsWith("/user/vip")&&!role.equals("vip")){
//                request.getRequestDispatcher("/user/noauth").forward(request, response);
//                return false;
//            }else if(URI.startsWith("/user/manager")&&!role.equals("manager")){
//                request.getRequestDispatcher("/user/noauth").forward(request, response);
//                return false;
//            }
//            return true;
//        }
//    }
//}
