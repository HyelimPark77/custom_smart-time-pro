.class public Lcom/sma/smartv3/ui/musicpicker/MusicResult$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/musicpicker/MusicResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/sma/smartv3/ui/musicpicker/MusicResult;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroid/os/Parcel;)Lcom/sma/smartv3/ui/musicpicker/MusicResult;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "in"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/ui/musicpicker/MusicResult;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public XIi00iiXO(I)[Lcom/sma/smartv3/ui/musicpicker/MusicResult;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "size"
        }
    .end annotation

    new-array p1, p1, [Lcom/sma/smartv3/ui/musicpicker/MusicResult;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "in"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/musicpicker/MusicResult$OXO1;->OXO1(Landroid/os/Parcel;)Lcom/sma/smartv3/ui/musicpicker/MusicResult;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "size"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/musicpicker/MusicResult$OXO1;->XIi00iiXO(I)[Lcom/sma/smartv3/ui/musicpicker/MusicResult;

    move-result-object p1

    return-object p1
.end method
