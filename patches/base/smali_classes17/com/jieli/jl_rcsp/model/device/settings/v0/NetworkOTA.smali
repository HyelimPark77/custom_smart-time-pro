.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;
.super Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private dataSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>(I)V

    .line 3
    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;->dataSize:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>(Landroid/os/Parcel;)V

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;->dataSize:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>([B)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getDataSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;->dataSize:I

    return v0
.end method

.method public parse([B)I
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;->dataSize:I

    if-eqz p1, :cond_1

    array-length v1, p1

    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, v0, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;->dataSize:I

    return v2

    :cond_1
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;->dataSize:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTA;->dataSize:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
