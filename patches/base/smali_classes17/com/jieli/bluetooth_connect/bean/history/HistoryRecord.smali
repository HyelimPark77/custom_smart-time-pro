.class public Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/room/Entity;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private address:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private connectType:I
    .annotation build Landroidx/room/ColumnInfo;
        name = "connect_type"
    .end annotation
.end field

.field private devType:I
    .annotation build Landroidx/room/ColumnInfo;
        name = "dev_type"
    .end annotation
.end field

.field private id:I
    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private leftDevLatitude:D
    .annotation build Landroidx/room/ColumnInfo;
        name = "left_dev_lat"
    .end annotation
.end field

.field private leftDevLongitude:D
    .annotation build Landroidx/room/ColumnInfo;
        name = "left_dev_lon"
    .end annotation
.end field

.field private leftDevUpdateTime:J
    .annotation build Landroidx/room/ColumnInfo;
        name = "left_dev_update_time"
    .end annotation
.end field

.field private mappedAddress:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
        name = "mapped_address"
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private onlineTime:J
    .annotation build Landroidx/room/ColumnInfo;
        name = "online_time"
    .end annotation
.end field

.field private pid:I

.field private rightDevLatitude:D
    .annotation build Landroidx/room/ColumnInfo;
        name = "right_dev_lat"
    .end annotation
.end field

.field private rightDevLongitude:D
    .annotation build Landroidx/room/ColumnInfo;
        name = "right_dev_lon"
    .end annotation
.end field

.field private rightDevUpdateTime:J
    .annotation build Landroidx/room/ColumnInfo;
        name = "right_dev_update_time"
    .end annotation
.end field

.field private sdkFlag:I
    .annotation build Landroidx/room/ColumnInfo;
        name = "sdk_flag"
    .end annotation
.end field

.field private uid:I

.field private updateAddress:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
        name = "update_address"
    .end annotation
.end field

.field private vid:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord$1;

    invoke-direct {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord$1;-><init>()V

    sput-object v0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "11:22:33:44:55:66"

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "in"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string v0, "11:22:33:44:55:66"

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->id:I

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->name:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->mappedAddress:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->devType:I

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->connectType:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->sdkFlag:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->vid:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->uid:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->pid:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLatitude:D

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLongitude:D

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevUpdateTime:J

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLatitude:D

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLongitude:D

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevUpdateTime:J

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->onlineTime:J

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->updateAddress:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "o"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    iget v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->connectType:I

    iget v3, p1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->connectType:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->sdkFlag:I

    iget v3, p1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->sdkFlag:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->vid:I

    iget v3, p1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->vid:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->uid:I

    iget v3, p1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->uid:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->pid:I

    iget v3, p1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->pid:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    iget-object v3, p1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->mappedAddress:Ljava/lang/String;

    iget-object p1, p1, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->mappedAddress:Ljava/lang/String;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getConnectType()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->connectType:I

    return v0
.end method

.method public getDevType()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->devType:I

    return v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->id:I

    return v0
.end method

.method public getLeftDevLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLatitude:D

    return-wide v0
.end method

.method public getLeftDevLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLongitude:D

    return-wide v0
.end method

.method public getLeftDevUpdateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevUpdateTime:J

    return-wide v0
.end method

.method public getMappedAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->mappedAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOnlineTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->onlineTime:J

    return-wide v0
.end method

.method public getPid()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->pid:I

    return v0
.end method

.method public getRightDevLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLatitude:D

    return-wide v0
.end method

.method public getRightDevLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLongitude:D

    return-wide v0
.end method

.method public getRightDevUpdateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevUpdateTime:J

    return-wide v0
.end method

.method public getSdkFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->sdkFlag:I

    return v0
.end method

.method public getUid()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->uid:I

    return v0
.end method

.method public getUpdateAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->updateAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getVid()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->vid:I

    return v0
.end method

.method public hashCode()I
    .locals 7

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->mappedAddress:Ljava/lang/String;

    iget v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->connectType:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->sdkFlag:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->vid:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->uid:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget v6, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->pid:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    return-void
.end method

.method public setConnectType(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "connectType"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->connectType:I

    return-void
.end method

.method public setDevType(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "devType"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->devType:I

    return-void
.end method

.method public setId(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "id"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->id:I

    return-void
.end method

.method public setLeftDevLatitude(D)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "leftDevLatitude"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLatitude:D

    return-void
.end method

.method public setLeftDevLongitude(D)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "leftDevLongitude"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLongitude:D

    return-void
.end method

.method public setLeftDevUpdateTime(J)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "leftDevUpdateTime"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevUpdateTime:J

    return-void
.end method

.method public setMappedAddress(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mappedAddress"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->mappedAddress:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "name"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->name:Ljava/lang/String;

    return-void
.end method

.method public setOnlineTime(J)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "onlineTime"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->onlineTime:J

    return-void
.end method

.method public setPid(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "pid"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->pid:I

    return-void
.end method

.method public setRightDevLatitude(D)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "rightDevLatitude"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLatitude:D

    return-void
.end method

.method public setRightDevLongitude(D)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "rightDevLongitude"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLongitude:D

    return-void
.end method

.method public setRightDevUpdateTime(J)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "rightDevUpdateTime"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevUpdateTime:J

    return-void
.end method

.method public setSdkFlag(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "sdkFlag"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->sdkFlag:I

    return-void
.end method

.method public setUid(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "uid"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->uid:I

    return-void
.end method

.method public setUpdateAddress(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "updateAddress"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->updateAddress:Ljava/lang/String;

    return-void
.end method

.method public setVid(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "vid"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->vid:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HistoryRecord{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", address=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mappedAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->mappedAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", updateAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->updateAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", devType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->devType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", connectType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->connectType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sdkFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->sdkFlag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", vid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->vid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->uid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->pid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leftDevLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLatitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", leftDevLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLongitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", leftDevUpdateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevUpdateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", rightDevLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLatitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", rightDevLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLongitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", rightDevUpdateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevUpdateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", onlineTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->onlineTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public updateLeftDevGpsInfo(DDJ)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "leftDevLatitude",
            "leftDevLongitude",
            "leftDevUpdateTime"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLatitude:D

    iput-wide p3, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLongitude:D

    iput-wide p5, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevUpdateTime:J

    return-void
.end method

.method public updateRightDevGpsInfo(DDJ)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "rightDevLatitude",
            "rightDevLongitude",
            "rightDevUpdateTime"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLatitude:D

    iput-wide p3, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLongitude:D

    iput-wide p5, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevUpdateTime:J

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "dest",
            "flags"
        }
    .end annotation

    iget p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->id:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->address:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->mappedAddress:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->devType:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->connectType:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->sdkFlag:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->vid:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->uid:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->pid:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLatitude:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevLongitude:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->leftDevUpdateTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLatitude:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevLongitude:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->rightDevUpdateTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->onlineTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->updateAddress:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
