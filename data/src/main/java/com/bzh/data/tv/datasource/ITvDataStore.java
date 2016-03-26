package com.bzh.data.tv.datasource;

import android.support.annotation.IntRange;

import com.bzh.data.film.entity.BaseInfoEntity;
import com.bzh.data.repository.IHtmlDataStore;

import java.util.ArrayList;

import rx.Observable;

/**
 * ==========================================================<br>
 * <b>版权</b>：　　　别志华 版权所有(c)2016<br>
 * <b>作者</b>：　　  biezhihua@163.com<br>
 * <b>创建日期</b>：　16-3-26<br>
 * <b>描述</b>：　　　<br>
 * <b>版本</b>：　    V1.0<br>
 * <b>修订历史</b>：　<br>
 * ==========================================================<br>
 */
public abstract class ITvDataStore extends IHtmlDataStore {

    /**
     * 国产合拍电视剧
     */
    abstract Observable<ArrayList<BaseInfoEntity>> getChineseDomesticTv(@IntRange(from = 1, to = 31) final int index);

    /**
     * 国产
     */
    abstract Observable<ArrayList<BaseInfoEntity>> getChineseDomesticTv_1(@IntRange(from = 1, to = 25) final int index);

    /**
     * 合拍电视剧
     */
    abstract Observable<ArrayList<BaseInfoEntity>> getChineseDomesticTv_2(@IntRange(from = 1, to = 7) final int index);


    /**
     * 港台电视剧
     */
    abstract Observable<ArrayList<BaseInfoEntity>> getHKTTv(@IntRange(from = 1, to = 5) final int index);

    /**
     * 华语电视
     */
    abstract Observable<ArrayList<BaseInfoEntity>> getChineseTv(@IntRange(from = 1, to = 33) final int index);

    /**
     * 日韩电视
     */
    abstract Observable<ArrayList<BaseInfoEntity>> getJapanSouthKoreaTV(@IntRange(from = 1, to = 45) final int index);

    /**
     * 欧美电视
     */
    abstract Observable<ArrayList<BaseInfoEntity>> getEuropeAmericaTV(@IntRange(from = 1, to = 22) final int index);
}
