/*
 * This file is generated by jOOQ.
 */
package com.wuda.tester.mysql.orm.tables.records;


import com.wuda.tester.mysql.orm.tables.Item;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 代表所有的物品
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemRecord extends UpdatableRecordImpl<ItemRecord> implements Record8<ULong, ULong, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 916977872;

    /**
     * Setter for <code>mysql_tester.item.item_id</code>.
     */
    public void setItemId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql_tester.item.item_id</code>.
     */
    public ULong getItemId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>mysql_tester.item.store_id</code>. 所属店铺ID
     */
    public void setStoreId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql_tester.item.store_id</code>. 所属店铺ID
     */
    public ULong getStoreId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>mysql_tester.item.type</code>. 商品类型 . 不同类型的商品, 保存到各自不同的表中.
     */
    public void setType(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql_tester.item.type</code>. 商品类型 . 不同类型的商品, 保存到各自不同的表中.
     */
    public UByte getType() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>mysql_tester.item.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql_tester.item.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>mysql_tester.item.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql_tester.item.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>mysql_tester.item.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql_tester.item.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>mysql_tester.item.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql_tester.item.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>mysql_tester.item.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>mysql_tester.item.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, ULong, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<ULong, ULong, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return Item.ITEM.ITEM_ID;
    }

    @Override
    public Field<ULong> field2() {
        return Item.ITEM.STORE_ID;
    }

    @Override
    public Field<UByte> field3() {
        return Item.ITEM.TYPE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Item.ITEM.CREATE_TIME;
    }

    @Override
    public Field<ULong> field5() {
        return Item.ITEM.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Item.ITEM.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field7() {
        return Item.ITEM.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field8() {
        return Item.ITEM.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getItemId();
    }

    @Override
    public ULong component2() {
        return getStoreId();
    }

    @Override
    public UByte component3() {
        return getType();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    @Override
    public ULong component5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component6() {
        return getLastModifyTime();
    }

    @Override
    public ULong component7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component8() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getItemId();
    }

    @Override
    public ULong value2() {
        return getStoreId();
    }

    @Override
    public UByte value3() {
        return getType();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    @Override
    public ULong value5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value6() {
        return getLastModifyTime();
    }

    @Override
    public ULong value7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value8() {
        return getIsDeleted();
    }

    @Override
    public ItemRecord value1(ULong value) {
        setItemId(value);
        return this;
    }

    @Override
    public ItemRecord value2(ULong value) {
        setStoreId(value);
        return this;
    }

    @Override
    public ItemRecord value3(UByte value) {
        setType(value);
        return this;
    }

    @Override
    public ItemRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public ItemRecord value5(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public ItemRecord value6(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public ItemRecord value7(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public ItemRecord value8(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public ItemRecord values(ULong value1, ULong value2, UByte value3, LocalDateTime value4, ULong value5, LocalDateTime value6, ULong value7, ULong value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemRecord
     */
    public ItemRecord() {
        super(Item.ITEM);
    }

    /**
     * Create a detached, initialised ItemRecord
     */
    public ItemRecord(ULong itemId, ULong storeId, UByte type, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(Item.ITEM);

        set(0, itemId);
        set(1, storeId);
        set(2, type);
        set(3, createTime);
        set(4, createUserId);
        set(5, lastModifyTime);
        set(6, lastModifyUserId);
        set(7, isDeleted);
    }
}
