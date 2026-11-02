.class public Lcom/sma/smartv3/ui/contactpicker/ContactResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/sma/smartv3/ui/contactpicker/ContactResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mContactID:Ljava/lang/String;

.field private mDisplayName:Ljava/lang/String;

.field private mEmails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mItemGroups:Ljava/lang/String;

.field private mPhoneNumbers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;",
            ">;"
        }
    .end annotation
.end field

.field private mPhoto:Ljava/lang/String;

.field private mStarred:Z

.field private mThumbnail:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/contactpicker/ContactResult$1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/contactpicker/ContactResult$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->CREATOR:Landroid/os/Parcelable$Creator;

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

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mEmails:Ljava/util/List;

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoneNumbers:Ljava/util/List;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mItemGroups:Ljava/lang/String;

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mContactID:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mDisplayName:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mStarred:Z

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoto:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mThumbnail:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mEmails:Ljava/util/List;

    .line 22
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoneNumbers:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readTypedList(Ljava/util/List;Landroid/os/Parcelable$Creator;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/ui/contactpicker/Contact;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "contact"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mEmails:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoneNumbers:Ljava/util/List;

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mItemGroups:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mContactID:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mDisplayName:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->isStarred()Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mStarred:Z

    .line 8
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getPhoto()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoto:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getThumbnail()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mThumbnail:Ljava/lang/String;

    .line 10
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mEmails:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mEmails:Ljava/util/List;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getEmails()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 11
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoneNumbers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoneNumbers:Ljava/util/List;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getPhoneNumbers()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getContactID()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mContactID:Ljava/lang/String;

    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mDisplayName:Ljava/lang/String;

    return-object v0
.end method

.method public getEmails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mEmails:Ljava/util/List;

    return-object v0
.end method

.method public getItemGroups()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mItemGroups:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneNumbers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoneNumbers:Ljava/util/List;

    return-object v0
.end method

.method public getPhoto()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoto:Ljava/lang/String;

    return-object v0
.end method

.method public getThumbnail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mThumbnail:Ljava/lang/String;

    return-object v0
.end method

.method public isStarred()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mStarred:Z

    return v0
.end method

.method public setContactID(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mContactID"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mContactID:Ljava/lang/String;

    return-void
.end method

.method public setDisplayName(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mDisplayName"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mDisplayName:Ljava/lang/String;

    return-void
.end method

.method public setItemGroups(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "itemGroups"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mItemGroups:Ljava/lang/String;

    return-void
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "phoneNumber"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoneNumbers:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;->setNumber(Ljava/lang/String;)V

    return-void
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

    iget-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mContactID:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mDisplayName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mStarred:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoto:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mThumbnail:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mEmails:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->mPhoneNumbers:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    return-void
.end method
