.class public Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;,
        Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private chargingBinQuantity:I

.field private deviceName:Ljava/lang/String;

.field private inEarSettings:I

.field private isDeviceCharging:Z

.field private isLeftCharging:Z

.field private isRightCharging:Z

.field private language:Ljava/lang/String;

.field private leftDeviceQuantity:I

.field private mKeySettingsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;",
            ">;"
        }
    .end annotation
.end field

.field private mLedSettingsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;",
            ">;"
        }
    .end annotation
.end field

.field private micChannel:I

.field private modes:[B

.field private pid:I

.field private rightDeviceQuantity:I

.field private uid:I

.field private vid:I

.field private workModel:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->vid:I

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->uid:I

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->pid:I

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->leftDeviceQuantity:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging:Z

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->rightDeviceQuantity:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging:Z

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->chargingBinQuantity:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging:Z

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->deviceName:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->micChannel:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->workModel:I

    .line 15
    sget-object v0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mKeySettingsList:Ljava/util/List;

    .line 16
    sget-object v0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mLedSettingsList:Ljava/util/List;

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->inEarSettings:I

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->language:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->modes:[B

    return-void
.end method

.method public static baseInfoCompare(Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    :cond_1
    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->pid:I

    iget v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->pid:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->vid:I

    iget v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->vid:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->uid:I

    iget v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->uid:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->leftDeviceQuantity:I

    iget v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->leftDeviceQuantity:I

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging:Z

    iget-boolean v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->rightDeviceQuantity:I

    iget v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->rightDeviceQuantity:I

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging:Z

    iget-boolean v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->chargingBinQuantity:I

    iget v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->chargingBinQuantity:I

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging:Z

    iget-boolean v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->micChannel:I

    iget v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->micChannel:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->workModel:I

    iget v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->workModel:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->inEarSettings:I

    iget v3, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->inEarSettings:I

    if-ne v2, v3, :cond_2

    iget-object p0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->deviceName:Ljava/lang/String;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->deviceName:Ljava/lang/String;

    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getChargingBinQuantity()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->chargingBinQuantity:I

    return v0
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->deviceName:Ljava/lang/String;

    return-object v0
.end method

.method public getInEarSettings()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->inEarSettings:I

    return v0
.end method

.method public getKeySettingsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mKeySettingsList:Ljava/util/List;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->language:Ljava/lang/String;

    return-object v0
.end method

.method public getLedSettingsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mLedSettingsList:Ljava/util/List;

    return-object v0
.end method

.method public getLeftDeviceQuantity()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->leftDeviceQuantity:I

    return v0
.end method

.method public getMicChannel()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->micChannel:I

    return v0
.end method

.method public getModes()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->modes:[B

    return-object v0
.end method

.method public getPid()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->pid:I

    return v0
.end method

.method public getRightDeviceQuantity()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->rightDeviceQuantity:I

    return v0
.end method

.method public getUid()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->uid:I

    return v0
.end method

.method public getVid()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->vid:I

    return v0
.end method

.method public getWorkModel()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->workModel:I

    return v0
.end method

.method public isDeviceCharging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging:Z

    return v0
.end method

.method public isLeftCharging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging:Z

    return v0
.end method

.method public isRightCharging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging:Z

    return v0
.end method

.method public setChargingBinQuantity(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->chargingBinQuantity:I

    return-object p0
.end method

.method public setDeviceCharging(Z)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging:Z

    return-object p0
.end method

.method public setDeviceName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->deviceName:Ljava/lang/String;

    return-object p0
.end method

.method public setInEarSettings(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->inEarSettings:I

    return-object p0
.end method

.method public setKeySettingsList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$KeySettings;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mKeySettingsList:Ljava/util/List;

    return-object p0
.end method

.method public setLanguage(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->language:Ljava/lang/String;

    return-object p0
.end method

.method public setLedSettingsList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mLedSettingsList:Ljava/util/List;

    return-object p0
.end method

.method public setLeftCharging(Z)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging:Z

    return-object p0
.end method

.method public setLeftDeviceQuantity(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->leftDeviceQuantity:I

    return-object p0
.end method

.method public setMicChannel(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->micChannel:I

    return-object p0
.end method

.method public setModes([B)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->modes:[B

    return-object p0
.end method

.method public setPid(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->pid:I

    return-object p0
.end method

.method public setRightCharging(Z)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging:Z

    return-object p0
.end method

.method public setRightDeviceQuantity(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->rightDeviceQuantity:I

    return-object p0
.end method

.method public setUid(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->uid:I

    return-object p0
.end method

.method public setVid(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->vid:I

    return-object p0
.end method

.method public setWorkModel(I)Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->workModel:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ADVInfoResponse{pid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->pid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", vid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->vid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->uid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", leftDeviceQuantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->leftDeviceQuantity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isLeftCharging="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", rightDeviceQuantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->rightDeviceQuantity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isRightCharging="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", chargingBinQuantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->chargingBinQuantity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isDeviceCharging="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", deviceName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->deviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", micChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->micChannel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", workModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->workModel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mKeySettingsList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mKeySettingsList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mLedSettingsList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mLedSettingsList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inEarSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->inEarSettings:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->language:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->modes:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->vid:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->uid:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->pid:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->leftDeviceQuantity:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isLeftCharging:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->rightDeviceQuantity:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isRightCharging:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->chargingBinQuantity:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->isDeviceCharging:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->deviceName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->micChannel:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->workModel:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mKeySettingsList:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->mLedSettingsList:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->inEarSettings:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->language:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->modes:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    return-void
.end method
