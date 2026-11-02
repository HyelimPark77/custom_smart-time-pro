.class public Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LedSettings"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private effect:I

.field private scene:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->scene:I

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->effect:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getEffect()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->effect:I

    return v0
.end method

.method public getScene()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->scene:I

    return v0
.end method

.method public setEffect(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->effect:I

    return-void
.end method

.method public setScene(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->scene:I

    return-void
.end method

.method public toData()[B
    .locals 4

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->scene:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v0

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->effect:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v2, 0x2

    new-array v2, v2, [B

    const/4 v3, 0x0

    aput-byte v0, v2, v3

    const/4 v0, 0x1

    aput-byte v1, v2, v0

    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LedSettings{scene="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->scene:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", effect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->effect:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->scene:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse$LedSettings;->effect:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
