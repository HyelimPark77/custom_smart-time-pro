.class public final Lcom/sma/smartv3/ui/launcher/LauncherActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/ad/OnShowADPCAdCompleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/launcher/LauncherActivity;->initADPCAd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/launcher/LauncherActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity$iO;->OXO1:Lcom/sma/smartv3/ui/launcher/LauncherActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShowAdComplete()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity$iO;->OXO1:Lcom/sma/smartv3/ui/launcher/LauncherActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->access$go(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V

    return-void
.end method
