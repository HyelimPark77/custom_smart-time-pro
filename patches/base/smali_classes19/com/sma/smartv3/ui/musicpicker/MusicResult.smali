.class public Lcom/sma/smartv3/ui/musicpicker/MusicResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/sma/smartv3/ui/musicpicker/MusicResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public I1:Ljava/lang/String;

.field public IO:J

.field public Ii1iii0:I

.field public O001I:I

.field public X0i1O:Ljava/lang/String;

.field public X11iII1O1:I

.field public X1IX:Ljava/lang/String;

.field public XXO:I

.field public XXX11i:J

.field public iIXi1iiXI:Ljava/lang/String;

.field public iX1O1:Ljava/lang/String;

.field public iXiX011:Z

.field public iXiiiO:Ljava/lang/String;

.field public iiiO:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/musicpicker/MusicResult$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/musicpicker/MusicResult$OXO1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->CREATOR:Landroid/os/Parcelable$Creator;

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

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->Ii1iii0:I

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->IO:J

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->I1:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iX1O1:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X11iII1O1:I

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXX11i:J

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X1IX:Ljava/lang/String;

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X0i1O:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iIXi1iiXI:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->O001I:I

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXO:I

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iXiiiO:Ljava/lang/String;

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->Ii1iii0:I

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iiiO:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/fw0;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "music"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->Ii1iii0:I

    .line 3
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->OIX0iXi()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->IO:J

    .line 4
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->getTitle()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->I1:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->XIi00iiXO()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iX1O1:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->IO()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X11iII1O1:I

    .line 7
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->O10IXXX0X()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXX11i:J

    .line 8
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->IiI10X()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X1IX:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->I1XOi1()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X0i1O:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->I0IIOi()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iIXi1iiXI:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->XXI()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->O001I:I

    .line 12
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->OIi0()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXO:I

    .line 13
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->XOO0ii0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iXiiiO:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->X1ii()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->Ii1iii0:I

    .line 15
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->X0O()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iiiO:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public I0IIOi()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X11iII1O1:I

    return v0
.end method

.method public I0iXXO()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXX11i:J

    return-wide v0
.end method

.method public I1(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "selected"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iXiX011:Z

    return-void
.end method

.method public I1XOi1(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "album"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iX1O1:Ljava/lang/String;

    return-void
.end method

.method public II1Xi0(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "uri"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iiiO:Ljava/lang/String;

    return-void
.end method

.method public IIX1OXO(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "artist"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X1IX:Ljava/lang/String;

    return-void
.end method

.method public IO()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->O001I:I

    return v0
.end method

.method public IiI10X()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iIXi1iiXI:Ljava/lang/String;

    return-object v0
.end method

.method public O00()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iXiiiO:Ljava/lang/String;

    return-object v0
.end method

.method public O10IXXX0X()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X0i1O:Ljava/lang/String;

    return-object v0
.end method

.method public OII(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "local"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->O001I:I

    return-void
.end method

.method public OIX0iXi()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->Ii1iii0:I

    return v0
.end method

.method public OIi0()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->IO:J

    return-wide v0
.end method

.method public OX(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "position"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->Ii1iii0:I

    return-void
.end method

.method public OiIIX101O(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "duration"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X11iII1O1:I

    return-void
.end method

.method public X01IiOiIi(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "title"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->I1:Ljava/lang/String;

    return-void
.end method

.method public X0O()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iXiX011:Z

    return v0
.end method

.method public X1ii()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iiiO:Ljava/lang/String;

    return-object v0
.end method

.method public XO0O10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X1IX:Ljava/lang/String;

    return-object v0
.end method

.method public XOO0ii0()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXO:I

    return v0
.end method

.method public XX0(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "download"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXO:I

    return-void
.end method

.method public XXI()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->I1:Ljava/lang/String;

    return-object v0
.end method

.method public XiOIO(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "auth"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iXiiiO:Ljava/lang/String;

    return-void
.end method

.method public XiOIii1(J)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "id"
        }
    .end annotation

    iput-wide p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->IO:J

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i010I(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "url"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X0i1O:Ljava/lang/String;

    return-void
.end method

.method public iIiiO(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "coverUrl"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iIXi1iiXI:Ljava/lang/String;

    return-void
.end method

.method public iO()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iX1O1:Ljava/lang/String;

    return-object v0
.end method

.method public iOOX010X(J)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "size"
        }
    .end annotation

    iput-wide p1, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXX11i:J

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

    iget-wide v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->IO:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->I1:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iX1O1:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X11iII1O1:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXX11i:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X1IX:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->X0i1O:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iIXi1iiXI:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->O001I:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->XXO:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iXiiiO:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->Ii1iii0:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/MusicResult;->iiiO:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
