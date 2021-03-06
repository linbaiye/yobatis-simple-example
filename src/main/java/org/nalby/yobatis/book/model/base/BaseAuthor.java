package org.nalby.yobatis.book.model.base;

import java.util.Date;

/*
 * This class corresponds to the table 'author', and is generated by MyBatis Generator.
 * Do NOT modify as it will be overwrote every time MyBatis Generator runs, put your code into
 * Author instead.
 */
public abstract class BaseAuthor {
    protected Long id;

    protected String name;

    protected Date birthday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", birthday=").append(birthday);
        sb.append("]");
        return sb.toString();
    }

    /**
     * Copy properties of this object to {@code dest} object.
     * @param dest the object to copy properties to.
     * @return the dest object.
     */
    public BaseAuthor copy(BaseAuthor dest) {
        if (dest == null) {
            throw new NullPointerException("dest must not be null.");
        }
        dest.id = this.id;
        dest.name = this.name;
        dest.birthday = this.birthday;
        return dest;
    }
}