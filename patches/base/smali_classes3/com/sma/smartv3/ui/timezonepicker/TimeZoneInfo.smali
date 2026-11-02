.class public Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final SEPARATOR:C = ','

.field public static is24HourFormat:Z

.field private static time:J


# instance fields
.field private isSelected:Z

.field private mCityName:Ljava/lang/String;

.field private mCountry:Ljava/lang/String;

.field private mDisplayName:Ljava/lang/String;

.field private mEnCityName:Ljava/lang/String;

.field private mKey:Ljava/lang/String;

.field mLocalTimeCache:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field mLocalTimeCacheReferenceTime:J

.field private mRawoffset:I

.field private mTimeZone:Ljava/util/TimeZone;

.field private mTimeZoneId:Ljava/lang/String;

.field private recycledTime:Landroid/text/format/Time;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    sput-wide v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->time:J

    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->is24HourFormat:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/TimeZone;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "tz",
            "country"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/text/format/Time;

    invoke-direct {v0}, Landroid/text/format/Time;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->recycledTime:Landroid/text/format/Time;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mLocalTimeCache:Landroid/util/SparseArray;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mLocalTimeCacheReferenceTime:J

    iput-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZone:Ljava/util/TimeZone;

    invoke-virtual {p2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZoneId:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mCountry:Ljava/lang/String;

    new-instance p3, Ljava/util/Date;

    invoke-direct {p3}, Ljava/util/Date;-><init>()V

    invoke-virtual {p2, p3}, Ljava/util/TimeZone;->inDaylightTime(Ljava/util/Date;)Z

    move-result p3

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Ljava/util/TimeZone;->getRawOffset()I

    move-result p3

    const v1, 0x36ee80

    add-int/2addr p3, v1

    iput p3, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mRawoffset:I

    invoke-virtual {p2, v0, v0}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mDisplayName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/util/TimeZone;->getRawOffset()I

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mRawoffset:I

    invoke-virtual {p2}, Ljava/util/TimeZone;->getDisplayName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mDisplayName:Ljava/lang/String;

    :goto_0
    iget-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZoneId:Ljava/lang/String;

    const-string p3, "/"

    invoke-virtual {p2, p3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    array-length p3, p2

    if-le p3, v0, :cond_1

    array-length p3, p2

    sub-int/2addr p3, v0

    aget-object p3, p2, p3

    const-string v1, "-"

    const-string v2, "_"

    invoke-virtual {p3, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p3

    const-string v3, " "

    invoke-virtual {p3, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mEnCityName:Ljava/lang/String;

    array-length p3, p2

    sub-int/2addr p3, v0

    aget-object p2, p2, p3

    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mKey:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZoneId:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mEnCityName:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mKey:Ljava/lang/String;

    :goto_1
    iget-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mKey:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getFinalCityName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mCityName:Ljava/lang/String;

    return-void
.end method

.method private static formatTime(Ljava/text/DateFormat;I)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "df",
            "s"
        }
    .end annotation

    int-to-long v0, p1

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getFinalCityName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "key"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "string"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object p1
.end method


# virtual methods
.method public compareTo(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;)I
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
    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZoneId:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZoneId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

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
    check-cast p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->compareTo(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;)I

    move-result p1

    return p1
.end method

.method public getCityName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mCityName:Ljava/lang/String;

    return-object v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mCountry:Ljava/lang/String;

    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mDisplayName:Ljava/lang/String;

    return-object v0
.end method

.method public getEnCityName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mEnCityName:Ljava/lang/String;

    return-object v0
.end method

.method public getGMTName()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZone:Ljava/util/TimeZone;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/TimeZone;->inDaylightTime(Ljava/util/Date;)Z

    move-result v1

    const/4 v2, 0x0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/TimeZone;->getDisplayName(ZILjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mKey:Ljava/lang/String;

    return-object v0
.end method

.method public getLocalTime(J)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "referenceTime"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->recycledTime:Landroid/text/format/Time;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Landroid/text/format/Time;->timezone:Ljava/lang/String;

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->recycledTime:Landroid/text/format/Time;

    invoke-virtual {v0, p1, p2}, Landroid/text/format/Time;->set(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->recycledTime:Landroid/text/format/Time;

    iget v1, v0, Landroid/text/format/Time;->year:I

    mul-int/lit16 v1, v1, 0x16e

    iget v2, v0, Landroid/text/format/Time;->yearDay:I

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZoneId:Ljava/lang/String;

    iput-object v2, v0, Landroid/text/format/Time;->timezone:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Landroid/text/format/Time;->set(J)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->recycledTime:Landroid/text/format/Time;

    iget v2, v0, Landroid/text/format/Time;->hour:I

    mul-int/lit8 v2, v2, 0x3c

    iget v0, v0, Landroid/text/format/Time;->minute:I

    add-int/2addr v2, v0

    iget-wide v3, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mLocalTimeCacheReferenceTime:J

    cmp-long v0, v3, p1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mLocalTimeCacheReferenceTime:J

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mLocalTimeCache:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mLocalTimeCache:Landroid/util/SparseArray;

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :goto_0
    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->recycledTime:Landroid/text/format/Time;

    iget p2, p1, Landroid/text/format/Time;->year:I

    mul-int/lit16 p2, p2, 0x16e

    iget v0, p1, Landroid/text/format/Time;->yearDay:I

    add-int/2addr p2, v0

    if-eq v1, p2, :cond_2

    sget-boolean p2, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->is24HourFormat:Z

    if-eqz p2, :cond_1

    const-string p2, "%b %d %H:%M"

    goto :goto_1

    :cond_1
    const-string p2, "%b %d %I:%M %p"

    goto :goto_1

    :cond_2
    sget-boolean p2, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->is24HourFormat:Z

    if-eqz p2, :cond_3

    const-string p2, "%H:%M"

    goto :goto_1

    :cond_3
    const-string p2, "%I:%M %p"

    :goto_1
    invoke-virtual {p1, p2}, Landroid/text/format/Time;->format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mLocalTimeCache:Landroid/util/SparseArray;

    invoke-virtual {p2, v2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_4
    return-object p1
.end method

.method public getRawoffset()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mRawoffset:I

    return v0
.end method

.method public getTimeZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZoneId:Ljava/lang/String;

    return-object v0
.end method

.method public hasSameRules(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "tzi"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZone:Ljava/util/TimeZone;

    iget-object p1, p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZone:Ljava/util/TimeZone;

    invoke-virtual {v0, p1}, Ljava/util/TimeZone;->hasSameRules(Ljava/util/TimeZone;)Z

    move-result p1

    return p1
.end method

.method public isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->isSelected:Z

    return v0
.end method

.method public setCityName(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mCityName"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mCityName:Ljava/lang/String;

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

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->isSelected:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mCountry:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZone:Ljava/util/TimeZone;

    iget-object v3, p0, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->mTimeZoneId:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2c

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v5}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4, v4}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/TimeZone;->useDaylightTime()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v2, v5, v5}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5, v4}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v4

    int-to-float v4, v4

    const v5, 0x4a5bba00    # 3600000.0f

    div-float/2addr v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/TimeZone;->getDSTSavings()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v5

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide v1, 0x13bf5fb8600L

    invoke-virtual {p0, v1, v2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getLocalTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide v1, 0x13d6debc200L

    invoke-virtual {p0, v1, v2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getLocalTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide v1, 0x13f9a1a9200L

    invoke-virtual {p0, v1, v2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getLocalTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-wide v1, 0x1421388c600L

    invoke-virtual {p0, v1, v2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneInfo;->getLocalTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
