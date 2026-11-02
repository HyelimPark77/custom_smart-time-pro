.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;
.super Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;",
            ">;"
        }
    .end annotation
.end field

.field public static final FUNC_BOOT_ANIM:I = 0x2

.field public static final FUNC_SCREEN_SAVERS:I = 0x1


# instance fields
.field private resourceInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;

.field private subFunction:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;)V
    .locals 3

    .line 2
    invoke-static {p2, p3}, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->convertPayload(ILcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;)[B

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, p1, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(III[B)V

    .line 3
    iput p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->subFunction:I

    .line 4
    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->resourceInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>(Landroid/os/Parcel;)V

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->subFunction:I

    .line 7
    const-class v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->resourceInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;-><init>([B)V

    return-void
.end method

.method public static convertPayload(ILcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->toData()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getResourceInfo()Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->resourceInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;

    return-object v0
.end method

.method public getSubFunction()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->subFunction:I

    return v0
.end method

.method public parse([B)I
    .locals 5

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->parse([B)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->getPayload()[B

    move-result-object v0

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    aget-byte v2, v0, v1

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->subFunction:I

    array-length v2, v0

    const/4 v3, 0x1

    if-le v2, v3, :cond_2

    array-length v2, v0

    sub-int/2addr v2, v3

    new-array v4, v2, [B

    invoke-static {v0, v3, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;

    invoke-direct {v0, v4}, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;-><init>([B)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->resourceInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;

    :cond_2
    :goto_0
    return p1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/SettingFunction;->writeToParcel(Landroid/os/Parcel;I)V

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->subFunction:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/FunctionResource;->resourceInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
