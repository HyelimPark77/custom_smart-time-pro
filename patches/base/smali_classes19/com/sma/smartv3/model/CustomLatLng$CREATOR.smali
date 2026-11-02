.class public final Lcom/sma/smartv3/model/CustomLatLng$CREATOR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/model/CustomLatLng;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CREATOR"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/sma/smartv3/model/CustomLatLng;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/model/CustomLatLng$CREATOR;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/sma/smartv3/model/CustomLatLng;
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/model/CustomLatLng$CREATOR;->createFromParcel(Landroid/os/Parcel;)Lcom/sma/smartv3/model/CustomLatLng;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/sma/smartv3/model/CustomLatLng;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .line 2
    new-array p1, p1, [Lcom/sma/smartv3/model/CustomLatLng;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/model/CustomLatLng$CREATOR;->newArray(I)[Lcom/sma/smartv3/model/CustomLatLng;

    move-result-object p1

    return-object p1
.end method
