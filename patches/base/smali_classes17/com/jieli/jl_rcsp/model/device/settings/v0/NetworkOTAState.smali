.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;
.super Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;",
            ">;"
        }
    .end annotation
.end field

.field public static final RESULT_UPGRADE_FAILED:I = 0x1

.field public static final RESULT_UPGRADE_SUCCESS:I = 0x0

.field public static final RESULT_UPGRADE_TIMEOUT:I = 0x2

.field public static final STATE_TRANSFERRING:I = 0x2

.field public static final STATE_UPGRADE_END:I = 0x0

.field public static final STATE_UPGRADE_START:I = 0x1


# instance fields
.field private code:I

.field private state:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>(I)V

    .line 3
    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->state:I

    .line 4
    iput p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->code:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>(Landroid/os/Parcel;)V

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->state:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->code:I

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

.method public getCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->code:I

    return v0
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->state:I

    return v0
.end method

.method public parse([B)I
    .locals 3

    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->type:I

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->state:I

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->code:I

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    array-length v1, p1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    aget-byte v0, p1, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->type:I

    const/4 v0, 0x1

    aget-byte v0, p1, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->state:I

    array-length v0, p1

    if-le v0, v2, :cond_1

    aget-byte p1, p1, v2

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->code:I

    const/4 p1, 0x3

    return p1

    :cond_1
    return v2

    :cond_2
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 7

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v3, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->state:I

    if-nez v3, :cond_0

    iget v4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->type:I

    int-to-byte v4, v4

    int-to-byte v3, v3

    iget v5, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->code:I

    int-to-byte v5, v5

    const/4 v6, 0x3

    new-array v6, v6, [B

    aput-byte v4, v6, v2

    aput-byte v3, v6, v1

    aput-byte v5, v6, v0

    return-object v6

    :cond_0
    iget v4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->type:I

    int-to-byte v4, v4

    int-to-byte v3, v3

    new-array v0, v0, [B

    aput-byte v4, v0, v2

    aput-byte v3, v0, v1

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NetworkOTAState{state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->state:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;->code:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
