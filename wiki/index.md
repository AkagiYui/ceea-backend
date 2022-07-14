# 功能说明

## 系统功能

- [x] 接口不存在的异常捕获
- [x] 服务发送错误的异常捕获
- [x] 日志可记录到数据库
- [ ] 账号权限控制
- [ ] Redis缓存
- [ ] 获取系统日志
- [ ] 审批待删除数据

## 日志功能

- [x] 日志可记录到数据库
- [x] 分页获取日志API

## 角色功能

- [ ] 添加角色
- [ ] 删除角色
- [ ] 分配角色权限
- [ ] 修改角色名称(角色标识不允许修改)
- [ ] 修改角色描述

## 用户功能

- [x] 账号登录(获取Token)
- [x] 账号注册(测试使用)
- [ ] 获取个人信息(包含权限信息)
- [ ] 获取账号列表
- [ ] 修改密码
- [ ] 修改姓名(用户名不允许修改)
- [ ] 修改邮箱
- [ ] 修改手机号
- [ ] 修改性别
- [ ] 新增用户
- [ ] 删除用户
- [ ] 启用/禁用用户
- [ ] 导入用户
- [ ] 导出用户
- [ ] 个人数据总览

## 学院功能

- [ ] 新增学院
- [ ] 删除学院
- [ ] 修改学院名称
- [ ] 修改学院描述

## 专业功能

- [ ] 新增专业
- [ ] 删除专业
- [ ] 修改专业名称
- [ ] 修改专业描述
- [ ] 修改所属学院
- [ ] 获取专业列表

## 班级功能

- [ ] 新增班级
- [ ] 删除班级
- [ ] 修改班级名称
- [ ] 修改所属专业
- [ ] 修改入学年份
- [ ] 修改毕业年份

## 学生功能

- [ ] 新增学生
- [ ] 删除学生
- [ ] 修改学生姓名
- [ ] 修改学生学号
- [ ] 修改学生性别
- [ ] 修改出生日期
- [ ] 修改所属班级
- [ ] 修改邮箱
- [ ] 修改手机号
- [ ] 修改家庭住址

## 学生功能

- [ ] 获取文件列表
- [ ] 上传文件
- [ ] 下载文件
- [ ] 获取(生成)下载链接
- [ ] 删除文件
- [ ] 文件重命名
- [ ] 启用/禁用文件

## 课程功能

- [ ] 获取课程列表

## 问卷功能

- [x] 获取问卷总览
- [x] 获取问卷列表
- [x] 切换问卷发布状态
- [x] 创建问卷
- [x] 删除问卷
- [x] 获取问卷详情
- [x] 修改问卷详情
- [x] 获取问卷卷面
- [x] 提交问卷回答
- [x] 获取回答数据
- [ ] 导出回答数据

## 以下是Markdown绘图测试

```mermaid
flowchart LR
A[student]; B[clazz]; C[Decision];
A-->B
B-->C
```

```mermaid
classDiagram
Class01 <|-- AveryLongClass : Cool
<<Interface>> Class01
Class09 --> C2 : Where am i?
Class09 --* C3
Class09 --|> Class07
Class07 : equals()
Class07 : Object[] elementData
Class01 : size()
Class01 : int chimp
Class01 : int gorilla
class Class10 {
  <<service>>
  int id
  size()
}
```
