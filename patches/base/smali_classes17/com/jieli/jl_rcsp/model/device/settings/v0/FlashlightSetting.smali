.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;
.super Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private value:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Integer;)V
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 2
    new-array v1, v0, [B

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 3
    new-array v1, v1, [B

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v2

    aput-byte v2, v1, v0

    :goto_0
    const/4 v2, 0x2

    .line 4
    invoke-direct {p0, v2, v0, p1, v1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(III[B)V

    if-eqz p2, :cond_1

    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;->value:I

    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(Landroid/os/Parcel;)V

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;->value:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>([B)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;->value:I

    return v0
.end method

.method public parse([B)I
    .locals 2

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->parse([B)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->getPayload()[B

    move-result-object v0

    array-length v1, v0

    if-nez v1, :cond_1

    :goto_0
    return p1

    :cond_1
    const/4 v1, 0x0

    aget-byte v0, v0, v1

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;->value:I

    return p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FlashlightSetting;->value:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
