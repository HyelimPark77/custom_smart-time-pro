.class public final Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/NewSportButtonProgress$iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->setButtonProgress()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public start(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/ShowProgressSportActivity;->showLongPressTip()V

    :cond_0
    return-void
.end method
