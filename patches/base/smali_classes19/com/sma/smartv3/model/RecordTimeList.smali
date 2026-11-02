.class public final Lcom/sma/smartv3/model/RecordTimeList;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mState:I

.field private final mTime:J


# direct methods
.method public constructor <init>(JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/sma/smartv3/model/RecordTimeList;->mTime:J

    iput p3, p0, Lcom/sma/smartv3/model/RecordTimeList;->mState:I

    return-void
.end method


# virtual methods
.method public final getMState()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordTimeList;->mState:I

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/RecordTimeList;->mTime:J

    return-wide v0
.end method
