.class public final Lcom/sma/androidthirdpartylogin/model/LoginResponse$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/androidthirdpartylogin/model/LoginResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/sma/androidthirdpartylogin/model/LoginResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/androidthirdpartylogin/model/LoginResponse$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroid/os/Parcel;)Lcom/sma/androidthirdpartylogin/model/LoginResponse;
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/androidthirdpartylogin/model/LoginResponse;

    invoke-direct {v0, p1}, Lcom/sma/androidthirdpartylogin/model/LoginResponse;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public XIi00iiXO(I)[Lcom/sma/androidthirdpartylogin/model/LoginResponse;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-array p1, p1, [Lcom/sma/androidthirdpartylogin/model/LoginResponse;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/androidthirdpartylogin/model/LoginResponse$OXO1;->OXO1(Landroid/os/Parcel;)Lcom/sma/androidthirdpartylogin/model/LoginResponse;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/androidthirdpartylogin/model/LoginResponse$OXO1;->XIi00iiXO(I)[Lcom/sma/androidthirdpartylogin/model/LoginResponse;

    move-result-object p1

    return-object p1
.end method
