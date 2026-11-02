.class public interface abstract Lcom/sma/smartv3/db/dao/RecordDeviceFileDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation


# virtual methods
.method public abstract delete(Ljava/util/List;)V
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Delete;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract deleteAll()V
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM RecordDeviceFile"
    .end annotation
.end method

.method public abstract deleteById(J)V
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM RecordDeviceFile WHERE mId = :id"
    .end annotation
.end method

.method public abstract getAlbumListAll()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 4 OR mFileType == 5 ORDER BY mTime DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDeviceFiletById(J)Lcom/sma/smartv3/db/entity/RecordDeviceFile;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordDeviceFile WHERE mId = :id"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract getFavorityList()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordDeviceFile WHERE mIsFavority == 1 ORDER BY mTime DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListAll()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 5 ORDER BY mTime DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getListByType(I)Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordDeviceFile WHERE mFileType == :fileType ORDER BY mTime DESC"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert(Ljava/util/List;)[J
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;)[J"
        }
    .end annotation
.end method

.method public abstract searchByNameIgnoreCase(Ljava/lang/String;)Ljava/util/List;
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "\n        SELECT * FROM RecordDeviceFile \n        WHERE LOWER(mName) LIKE \'%.aac\' \n        AND SUBSTR(mName, 1, LENGTH(mName) - 4) LIKE \'%\' || :keyword || \'%\' COLLATE NOCASE \n        ORDER BY mTime DESC\n        "
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;"
        }
    .end annotation
.end method

.method public abstract update(Ljava/util/List;)I
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceFile;",
            ">;)I"
        }
    .end annotation
.end method
