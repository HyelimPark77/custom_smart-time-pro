.class public Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/ProgressCalendarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "XIi00iiXO"
.end annotation


# instance fields
.field public OXO1:I

.field public XIi00iiXO:I


# direct methods
.method public constructor <init>(II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "progress",
            "color"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;->OXO1:I

    iput p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;->XIi00iiXO:I

    return-void
.end method
