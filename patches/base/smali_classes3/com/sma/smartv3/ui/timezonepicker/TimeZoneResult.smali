.class public Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public I1:Ljava/lang/String;

.field public IO:I

.field public X0i1O:Z

.field public X11iII1O1:Ljava/lang/String;

.field public X1IX:Ljava/lang/String;

.field public XXX11i:Ljava/lang/String;

.field public iIXi1iiXI:I

.field public iX1O1:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult$OXO1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "in"
        }
    .end annotation

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iX1O1:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X11iII1O1:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->I1:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->XXX11i:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iIXi1iiXI:I

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timeZoneInfo"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getTimeZoneId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->I1:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCountry()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iX1O1:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X11iII1O1:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getCityName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->XXX11i:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getRawoffset()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iIXi1iiXI:I

    .line 7
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getEnCityName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X1IX:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public I0IIOi()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iIXi1iiXI:I

    return v0
.end method

.method public I0iXXO(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mCountry"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iX1O1:Ljava/lang/String;

    return-void
.end method

.method public I1XOi1(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mRawoffset"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iIXi1iiXI:I

    return-void
.end method

.method public IIX1OXO(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mTimeZoneId"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->I1:Ljava/lang/String;

    return-void
.end method

.method public IO()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X0i1O:Z

    return v0
.end method

.method public IiI10X()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X1IX:Ljava/lang/String;

    return-object v0
.end method

.method public O00()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X11iII1O1:Ljava/lang/String;

    return-object v0
.end method

.method public O10IXXX0X(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "id"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->IO:I

    return-void
.end method

.method public OIX0iXi(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mCityName"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->XXX11i:Ljava/lang/String;

    return-void
.end method

.method public OIi0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->I1:Ljava/lang/String;

    return-object v0
.end method

.method public X0O(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "local"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X0i1O:Z

    return-void
.end method

.method public X1ii(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mEnCityName"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X1IX:Ljava/lang/String;

    return-void
.end method

.method public XO0O10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iX1O1:Ljava/lang/String;

    return-object v0
.end method

.method public XOO0ii0()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->IO:I

    return v0
.end method

.method public XXI(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mDisplayName"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X11iII1O1:Ljava/lang/String;

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iO()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->XXX11i:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
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

    iget-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iX1O1:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->X11iII1O1:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->I1:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->XXX11i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iIXi1iiXI:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
