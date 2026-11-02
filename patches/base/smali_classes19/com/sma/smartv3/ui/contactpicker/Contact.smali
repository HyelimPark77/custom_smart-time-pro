.class public Lcom/sma/smartv3/ui/contactpicker/Contact;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/sma/smartv3/ui/contactpicker/Contact;",
        ">;"
    }
.end annotation


# instance fields
.field private backgroundColor:I

.field private isSelected:Z

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

.field private final mId:J

.field private mInVisibleGroup:I

.field private mPhoneNumbers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;",
            ">;"
        }
    .end annotation
.end field

.field private mPhoto:Landroid/net/Uri;

.field private mStarred:Z

.field private mThumbnail:Landroid/net/Uri;


# direct methods
.method public constructor <init>(J)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "id"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mEmails:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mPhoneNumbers:Ljava/util/List;

    const v0, -0xffff01

    iput v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->backgroundColor:I

    iput-wide p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mId:J

    invoke-static {}, Lcom/sma/smartv3/ui/contactpicker/ColorUtils;->getRandomMaterialColor()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->backgroundColor:I

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/sma/smartv3/ui/contactpicker/Contact;)I
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "other"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mDisplayName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/sma/smartv3/ui/contactpicker/Contact;->mDisplayName:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "other"
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->compareTo(Lcom/sma/smartv3/ui/contactpicker/Contact;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "o"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/Contact;

    iget-wide v2, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mId:J

    iget-wide v4, p1, Lcom/sma/smartv3/ui/contactpicker/Contact;->mId:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public getBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->backgroundColor:I

    return v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mDisplayName:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mEmails:Ljava/util/List;

    return-object v0
.end method

.method public getId()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mId:J

    return-wide v0
.end method

.method public getInVisibleGroup()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mInVisibleGroup:I

    return v0
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mPhoneNumbers:Ljava/util/List;

    return-object v0
.end method

.method public getPhoto()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mPhoto:Landroid/net/Uri;

    return-object v0
.end method

.method public getThumbnail()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mThumbnail:Landroid/net/Uri;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mId:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->isSelected:Z

    return v0
.end method

.method public isStarred()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mStarred:Z

    return v0
.end method

.method public setBackgroundColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "backgroundColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->backgroundColor:I

    return-void
.end method

.method public setDisplayName(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "displayName"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mDisplayName:Ljava/lang/String;

    return-void
.end method

.method public setEmails(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "emails"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mEmails:Ljava/util/List;

    return-void
.end method

.method public setInVisibleGroup(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "inVisibleGroup"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mInVisibleGroup:I

    return-void
.end method

.method public setPhoneNumbers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "phoneNumbers"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mPhoneNumbers:Ljava/util/List;

    return-void
.end method

.method public setPhoto(Landroid/net/Uri;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "photo"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mPhoto:Landroid/net/Uri;

    return-void
.end method

.method public setSelected(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "selected"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->isSelected:Z

    return-void
.end method

.method public setStarred(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "starred"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mStarred:Z

    return-void
.end method

.method public setThumbnail(Landroid/net/Uri;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "thumbnail"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/Contact;->mThumbnail:Landroid/net/Uri;

    return-void
.end method
