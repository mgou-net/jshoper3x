package com.jshop.dao;

import java.util.List;

import com.jshop.entity.GoodsTypeBrandT;

public interface GoodsTypeBrandTDao {

	/**
	 * 增加类型品牌
	 * @param gtbt
	 * @return
	 */
	public  int addGoodsTypeBrand(GoodsTypeBrandT gtbt);
	/**
	 * 删除类型品牌
	 * @param list
	 * @return
	 */
	public  int delGoodsTypeBrand(String []list );

	/**
	 * 查询所有类型品牌
	 * @param currentPage
	 * @param lineSize
	 * @return
	 */
	public  List<GoodsTypeBrandT>findAllGoodsTypeBrand(final int currentPage,final int lineSize);
	/**
	 * 统计查询所类型品牌
	 * @return
	 */
	public  int countfindAllGoodsTypeBrand();
	/**
	 * 根据品牌和类型id获取商品类型品牌
	 * @param brandid
	 * @return
	 */
	public GoodsTypeBrandT findGoodsTypeBrandByBrandid(String brandid,String goodsTypeId);
	/**
	 * 根据排序字段按照排序方式排序
	 * @param currentPage
	 * @param lineSize
	 * @return
	 */
	public  List<GoodsTypeBrandT>sortAllGoodsTypeBrand(final int currentPage,final int lineSize,String queryString);
	/**
	 * 更新类型品牌中的商品类型名称
	 * @param name
	 * @param goodsTypeId
	 * @return
	 */
	public  int updateGoodsTypeBrandTname(String name,String goodsTypeId);
	/**
	 * 根据商品类型id获取旗下所有商品品牌
	 * @param goodsTypeId
	 * @return
	 */
	public  List<GoodsTypeBrandT>findBrandBygoodsTypeId(String goodsTypeId);
	/**
	 * 根据品牌id获取商品类型
	 * @param brandid
	 * @return
	 */
	public GoodsTypeBrandT findGoodsTypeIdByBrandid(String brandid);
	
}
