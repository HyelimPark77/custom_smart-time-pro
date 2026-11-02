.class public interface abstract Lcom/sma/smartv3/db/dao/DeviceInfoDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/room/Dao;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/dao/DeviceInfoDao$DefaultImpls;
    }
.end annotation


# direct methods
.method public static synthetic access$setActiveDevice$jd(Lcom/sma/smartv3/db/dao/DeviceInfoDao;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->setActiveDevice(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public abstract clearActiveStatus()I
    .annotation build Landroidx/room/Query;
        value = "UPDATE RecordDeviceInfo SET isActive = 0"
    .end annotation
.end method

.method public abstract delete(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)I
    .param p1    # Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Delete;
    .end annotation
.end method

.method public abstract deleteAll()I
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM RecordDeviceInfo"
    .end annotation
.end method

.method public abstract deleteByMac(Ljava/lang/String;)I
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "DELETE FROM RecordDeviceInfo WHERE mMac = :mac"
    .end annotation
.end method

.method public abstract getActiveDevice()Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordDeviceInfo ORDER BY isActive DESC, mId ASC LIMIT 1"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getAllDevices()Ljava/util/List;
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordDeviceInfo"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDeviceByMac(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "SELECT * FROM RecordDeviceInfo WHERE mMac = :mac"
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end method

.method public abstract getDeviceCount()I
    .annotation build Landroidx/room/Query;
        value = "SELECT COUNT(*) FROM RecordDeviceInfo"
    .end annotation
.end method

.method public abstract hasDevices()Z
    .annotation build Landroidx/room/Query;
        value = "SELECT EXISTS(SELECT 1 FROM RecordDeviceInfo LIMIT 1)"
    .end annotation
.end method

.method public abstract insertOrUpdate(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)J
    .param p1    # Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Insert;
        onConflict = 0x1
    .end annotation
.end method

.method public abstract insertOrUpdateList(Ljava/util/List;)[J
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
            "Lcom/sma/smartv3/db/entity/RecordDeviceInfo;",
            ">;)[J"
        }
    .end annotation
.end method

.method public setActiveDevice(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Transaction;
    .end annotation

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->clearActiveStatus()I

    invoke-interface {p0, p1}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->setDeviceActive(Ljava/lang/String;)I

    return-void
.end method

.method public abstract setDeviceActive(Ljava/lang/String;)I
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Query;
        value = "UPDATE RecordDeviceInfo SET isActive = 1 WHERE mMac = :mac"
    .end annotation
.end method

.method public abstract update(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)I
    .param p1    # Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Update;
    .end annotation
.end method
