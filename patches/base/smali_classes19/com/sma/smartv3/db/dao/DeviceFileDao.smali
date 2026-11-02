.class public interface abstract Lcom/sma/smartv3/db/dao/DeviceFileDao;
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
        value = "DELETE FROM DeviceFile"
    .end annotation
.end method

.method public abstract deleteById(J)V
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM DeviceFile WHERE mId = :id"
    .end annotation
.end method

.method public abstract getAlbumListAll()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM DeviceFile WHERE mFileType == 1 OR mFileType == 2 ORDER BY mTime DESC"
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
        value = "SELECT * FROM DeviceFile WHERE mId = :id"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public abstract getFavorityList()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM DeviceFile WHERE mIsFavority == 1 ORDER BY mTime DESC"
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
        value = "SELECT * FROM DeviceFile WHERE mFileType == :fileType ORDER BY mTime DESC"
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
